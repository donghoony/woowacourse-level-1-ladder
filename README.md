# 사다리 타기

### TDD

- 도메인 지식을 알고 있는 경우 In -> Out, 자세히 모르는 경우 Out -> In으로 들어오면서 도메인 지식을 쌓는다.
- Test-Code-Refactor 단위로 커밋은 하지 않으나, 모든 구간에서 TDD 사이클을 지킨다.
- 모든 커밋 단위는 테스트를 통과한다.
- **살아있는 문서**를 작성하기 위해 노력한다.

### 기능 요구사항

#### 사다리

- [x] 줄 번호에 따른 매핑 정보를 반환한다.

#### 한 줄 (Line)

각 점의 이동 방향(Direction)들을 받아 생성된다.

- [x] 방향 리스트의 크기를 검증한다. (최소 두 개 이상의 방향이 들어와야 한다.)
- [x] 각 Direction에 대해서, 오른쪽 Direction이 서로 페어 방향인지 검증한다.
- [x] 인덱스가 주어지면, 해당 라인을 거친 뒤의 인덱스를 반환한다.

#### 방향 (Direction)

각 점의 이동 방향을 나타낸다. 각 방향은 오른쪽에 올 수 있는 페어 방향이 있다. (ex. `RIGHT` -> `LEFT`)

- [x] 움직인 뒤 인덱스를 반환한다.
- [x] 현재 방향에 대해, 다음 방향을 잇고 싶은지가 주어지면, 상황에 따라 적절한 방향을 반환한다. (ex. 현재 `RIGHT`일 때, `LEFT`를 반환)

#### 인덱스 (Index)

몇 번째 사다리를 타고 있는지에 대한 정보를 나타낸다.

- [x] 다음 인덱스를 반환한다.
- [x] 이전 인덱스를 반환한다.

#### 이름

- [ ] 이름은 영어 소문자로만 이루어진다.
- [ ] 이름은 1자부터 5글자까지 가능하다.

#### 입출력

- 모든 비즈니스 로직이 완성되기 전까지 입출력을 구현하지 않는다.
- [ ] 사다리를 출력할 때 사람 이름도 같이 출력한다.
- [ ] 사람 이름은 쉼표(,)를 기준으로 구분한다.
- [ ] 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- [ ] 사다리 실행 결과를 출력해야 한다.
- [ ] 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.
