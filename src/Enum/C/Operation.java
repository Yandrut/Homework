package Enum.C;

public enum Operation {
    ADDITION {
        @Override
        public float execute (float one, float two) {
            return one + two;
        }
    },
    SUBTRACTION {
        @Override
        public float execute (float one, float two) {
            return one - two;
        }
    },
    DIVISION {
        @Override
        public float execute(float one, float two) {
            float result = 0;
            try {
                result = one/two;
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            return result;
        }
    },
    MULTIPLICATION {
        @Override
        public float execute(float one, float two) {
            return one * two;
        }
    };

    abstract float execute (float one, float two);
}
