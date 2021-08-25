package limb.networks.tests;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    @GetMapping
    public String HelloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/sqrt")
    public String FirstTest(@RequestParam int n) {
        return Integer.toString(Sqrt(n));
    }

    @GetMapping("/quadraticEquation")
    public String SecondTest(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        int[] x = quadraticEquation(a, b, c);
        return "X0=" + x[0] + " X1=" + x[1];
    }
    // Серег! Вот твои первые методы которые ты должен реализовать
    // Возведение в квадрат
    // Вот ссылка. Для теста. вместо n подставляешь свое число
    // http://localhost:8080/main/sqrt?n=1
    private int Sqrt(int n) {
        //TODO:
        return 0;
    }

    // Квадратное уравнение
    // Получить пожно с помощью
    // http://localhost:8080/main/quadraticEquation?a=0&b=1&c=2
    private int[] quadraticEquation(int a, int b, int c) {
        int[] x = new int[] { 0,0 };
        //TODO:
        return x;
    }
}
