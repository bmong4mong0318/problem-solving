# 놓치기 쉬운 부분들

- 테스트 케이스를 여러개 줄 경우 각각의 테스트 케이스 마다 자료구조를 초기화 해주어야 한다.
- 그래프, 트리등에서 끊어진 경우를 고려하자.
- 디피 문제는 경우의 수를 몇개 해보며 규칙을 찾아보자.
  - 이전 결과를 반영하여, 현재 결과를 진행한다.
  - 테이블의 의미를 정의하고, 점화식과 초기값을 찾는다.
- 모르겠으면 우선 정렬부터 시켜 놓고 생각해보자.
- 그리디가 아닌 것을 그리디로 착각하는 것을 주의하자.
- 연산 횟수가 5억정도면 약 1초로 생각하자.
- max 값으로 갱신할 때는 Integer.MIN_VALUE, min 값으로 갱신할 때는 INTEGER.MAX_VALUE
  - 이때 각 값의 오버플로우 주의


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

- 모든 양의 정수는 소인수 분해를 갖는다.
- 두 수 a, b의 최소공배수 = a * b / (두 수의 최대공약수)
- 골드바흐의 추측: 2보다 큰 모든 짝수는 2개의 소수합으로 표현할 수 있다.

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