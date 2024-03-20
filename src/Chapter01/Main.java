package Chapter01;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");
        //외부 패키지를 사용하려면, 모든 경로를 다 불러줘야 사용할 수 있다. System class안에 out안에 print 호출

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}

// 추상test
// 1 ~ 10 까지 더하는 프로그램
// 첫 단계 변수 생성 : 프로그램을 작성하는데 필요한 첫번째 정보, 변수를 설정하는 것은 프로그램을 작성하는데 중요한 첫걸음 ex) 1 ~ 10 까지 변하는 숫자 정보, 전부 더한 결과 값을 나타내는 정보
// 모든 일은 해결하기 위하여 어떤 것이 필요한지 어떤 정보가 필요한지 알고 그 정보들을 어떻게 조합해야 하는지 고민한다. 알고리즘을 짜는 기본적인 생각.