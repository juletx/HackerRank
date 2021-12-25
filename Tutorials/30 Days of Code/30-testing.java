

    static class TestDataEmptyArray {
        public static int[] get_array() {
            int[] array = {};
            return array;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            int[] array = {0, 1, 2, 3, 4};
            return array;
        }

        public static int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            int[] array = {1, 1, 2, 3, 4};
            return array;
        }

        public static int get_expected_result() {
            return 0;
        }
    }

