# 놓치기 쉬운 부분들

- 테스트 케이스를 여러개 줄 경우 각각의 테스트 케이스 마다 자료구조를 초기화 해주어야 한다.
- 그래프, 트리등에서 끊어진 경우를 고려하자.
- 인접 리스트 : `List<Integer>[] adj;`