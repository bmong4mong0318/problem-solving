# 놓치기 쉬운 부분들

- 테스트 케이스를 여러개 줄 경우 각각의 테스트 케이스 마다
  - 자료구조를 초기화 해주어야 한다.
  - 테스트케이스 마다의 출력도 배열에 모아서 마지막에 한번에 뽑자.
- 연산 횟수가 5억정도면 약 1초로 생각하자.
  - 이때 각 값의 오버플로우 주의
- flag 세우는 건 최대한 지양하자. 예외사항에 너무 위험하다.
- 자료형 선언시에 항상 주의!
- for문 0부터 n-1까지 돌릴지, 1부터 n까지 돌릴지 문제에 따라서 주의하자.

## 탐색
- 그래프, 트리등에서 끊어진 경우를 고려하자.
  - 그래프, 트리 문제에서 연결 여부를 확인할때는 루트와 노드간의 관계를 생각해야한다.
    - 노드끼리의 관계만 찾다보면 끊어진 경우를 놓치게 될 수 있다.
      - 자기들끼리는 부모가 같은데 해당조건에서 벗어난 경우가 생길 수 있다.
- BFS, DFS 문제시에
  - 구역개수: 탐색 끝날때마다 return 1 해서 cnt에 더해주는 식으로
  - 단계별개수: 큐에 넣을 때마다 isVisited++ 해주는 식으로

## DP
- dp 라고 판단되면 가장 마지막에 풀기
  - dp 문제는 경우의 수를 몇개 해보며 규칙을 찾아보자.
    - 이전 결과를 반영하여, 현재 결과를 진행한다.
    - 테이블의 의미를 정의하고, 점화식과 초기값을 찾는다.

## 정렬, 그리디
- max 값으로 갱신할 때는 Integer.MIN_VALUE, min 값으로 갱신할 때는 INTEGER.MAX_VALUE
  - 최대 최소 갱신 문제는 어려우면 for문을 거꾸로 돌려보자.
- 그리디가 아닌 것을 그리디로 착각하는 것을 주의하자.
  - 모르겠으면 우선 정렬부터 시켜 놓고 생각해보자. 정렬하면 안되는 경우도 있다.

## 수학
- 모든 양의 정수는 소인수 분해를 갖는다.
- 두 수 a, b의 최소공배수 = a * b / (두 수의 최대공약수)
- 골드바흐의 추측: 2보다 큰 모든 짝수는 2개의 소수합으로 표현할 수 있다.


```java
    private static void printPrime(Integer num) {
        for (int i = 2; i <= 5_000_000; i++) {
            num = divideByPrime(num, i);
            if (num == 1) break;
//        if (divideByPrime(num, i) == 1) break; -> 이런식으로 쓰는것은 num값의 갱신을 막는다.
        }
        System.out.println();
    }
```

```java
// 입력값의 범위를 잘 확인하자.
//int	-2147483648 ~ 2147483647 (10^9)
//long	-9223372036854775808 ~ 9223372036854775807 (10^18)
long A = Long.parseLong(st.nextToken());
int B = Integer.parseInteger(st.nextToken());
```

```java
loop:
for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
        if (isInteger(j))
            break loop; // loop으로 이동, goto와 비슷한 기능
    }
}
```

```java
while (true){

    st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    if (a == -1 && b == -1 && c == -1) break;
    
    // 출력을 여러번 해야하는 경우 성능이 떨어지므로 `StringBuilder`로 출력을 모아준뒤
    sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append('\n');
}
// 실제 출력은 한번만 하도록 한다.
System.out.println(sb);
```

```java
// 11110000
// 11110000
// 00011100
// 00011100
// 11110000
// 11110000
// 11110011
// 11110011

// 숫자 사이에 공백이 없는 경우 
for (int i = 0; i < N; i++){
    String str = br.readLine();
    for (int j = 0; j < N; j++){
        map[i][j] = str.charAt(j) - '0';
    }
}

// 1 1 1 1 0 0 0 0
// 1 1 1 1 0 0 0 0
// 0 0 0 1 1 1 0 0
// 0 0 0 1 1 1 0 0
// 1 1 1 1 0 0 0 0
// 1 1 1 1 0 0 0 0
// 1 1 1 1 0 0 1 1
// 1 1 1 1 0 0 1 1

// 숫자 사이에 공백이 있는 경우
for (int i = 0; i < N; i++){
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < N; j++){
        map[i][j] = Integer.parseInt(st.nextToken());
    }
}
```