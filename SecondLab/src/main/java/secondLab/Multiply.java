package secondLab;

import org.springframework.stereotype.Service;

@Service
public class Multiply implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}
