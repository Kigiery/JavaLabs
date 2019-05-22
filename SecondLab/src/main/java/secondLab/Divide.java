package secondLab;

import org.springframework.stereotype.Service;

@Service
public class Divide implements MathOperation {

    @Override
    public int operate(int a, int b) {
        return a / b;
    }
}
