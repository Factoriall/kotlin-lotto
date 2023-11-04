# kotlin-lotto

## 문자열 덧셈 계산기

### 기능 목록

- [X] 계산기는 null 또는 0을 받았을 경우, 0을 반환해야 한다.
- [X] 계산기는 숫자 하나만을 입력할 경우, 숫자를 반환한다.
- [X] 기본 구분자는 콤마(,)와 콜론(:)이다.
- [X] 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자이다.
- [X] 입력기는 숫자와 구분자를 같이 입력한 경우, 구분자 사이의 토큰들을 반환한다.
- [X] 토큰들이 숫자가 아니거나, 음수일 경우 RuntimeException 예외를 던진다.
- [X] 숫자토큰 목록을 받았을 때 이를 모두 더한 값을 받는다.

## 로또

### 기능 목록
- [] 로또 부스는 가격 입력 시, 가격에 맞는 로또를 제시한다.
- [] 로또는 6개의 숫자로 이뤄져 있으며, 1~49 사이 숫자에 겹치면 안된다. 
- [] 당첨 번호는 6개의 숫자로 이뤄져 있으며, 1~49 사이 숫자에 겹치면 안된다.
- [] 로또는 당첨 번호랑 3개 일치하면 4등이다.
- [] 로또는 당첨 번호랑 4개 일치하면 3등이다.
- [] 로또는 당첨 번호랑 5개 일치하면 2등이다.
- [] 로또는 당첨 번호랑 6개 일치하면 1등이다.
- [] 로또 결과값은 당첨 순위에 맞춰 알맞은 수익 및 수익률을 제시한다. 
