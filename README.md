# 놓치기 쉬운 부분들

- 테스트 케이스를 여러개 줄 경우 각각의 테스트 케이스 마다 자료구조를 초기화 해주어야 한다.
- 그래프, 트리등에서 끊어진 경우를 고려하자.
- 디피 문제는 경우의 수를 몇개 해보며 규칙을 찾아보자.
  - 테이블의 의미를 정의하고, 점화식과 초기값을 찾는다.
- 모르겠으면 우선 정렬부터 시켜 놓고 생각해보자.
- 그리디가 아닌 것을 그리디로 착각하는 것을 주의하자.


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

- 모든 양의 정수는 소인수 분해를 갖는다.
- 골드바흐의 추측: 2보다 큰 모든 짝수는 2개의 소수합으로 표현할 수 있다.