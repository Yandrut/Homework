package Enum.C;

public enum Operation {
    Addition {
        @Override
        public float execute (float one, float two) {
            return one + two;
        }
    },
    Subtraction {
        @Override
        public float execute (float one, float two) {
            return one - two;
        }
    },
    Division {
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
    Multiplication {
        @Override
        public float execute(float one, float two) {
            return one * two;
        }
    };

    abstract float execute (float one, float two);
}
