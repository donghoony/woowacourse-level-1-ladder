package domain.player;

import java.util.List;

public class Players {

    private static final int MIN_PLAYERS_SIZE = 2;
    private static final int MAX_PLAYERS_SIZE = 10;

    private final List<Name> names;

    public Players(List<String> names) {
        validateSize(names);
        validateUniqueNames(names);
        this.names = names.stream()
                .map(Name::new)
                .toList();
    }

    private void validateUniqueNames(List<String> names) {
        int uniqueNameCount = (int) names.stream()
                .distinct()
                .count();
        if (names.size() != uniqueNameCount) {
            throw new IllegalArgumentException("중복된 이름이 존재합니다.");
        }
    }

    public List<String> getNames() {
        return names.stream()
                .map(Name::name)
                .toList();
    }

    public int size() {
        return names.size();
    }

    private void validateSize(List<String> names) {
        if (names.size() < MIN_PLAYERS_SIZE || names.size() > MAX_PLAYERS_SIZE) {
            throw new IllegalArgumentException("참여하는 사람의 수는 2명 이상 10명 이하여야 합니다.");
        }
    }
}
