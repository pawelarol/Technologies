
    public class ThreadSpeedComparison {
        public static void main(String[] args) {
            long startTime, endTime;

            // Запускаем первый поток и фиксируем время старта
            startTime = System.nanoTime();
            Thread thread1 = new Thread(() -> {
                int n = 10;
                long result = fibonacci(n);
                System.out.println("The number Fibonacci: " + n + "=" + result);
            });
            thread1.start();

            // Запускаем второй поток и фиксируем время старта
            startTime = System.nanoTime();
            Thread thread2 = new Thread(() -> {
                int n = 5;
                try {
                    long result = factorial(n);
                    System.out.println("Factorial number: " + n + " = "+ result );
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            });
            thread2.start();

            try {
                // Ожидаем завершения обоих потоков
                thread1.join();
                thread2.join();

                // Фиксируем время окончания выполнения
                endTime = System.nanoTime();

                // Выводим результаты
                long timeElapsedThread1 = endTime - startTime;
                System.out.println("Время выполнения первого потока: " + timeElapsedThread1 + " наносекунд");

                // Второй раз получаем время старта для второго потока
                startTime = System.nanoTime();
                // Выполняем второй поток повторно
                thread2 = new Thread(() -> {
                    // Код выполнения второго потока (можно использовать другие задачи)
                });
                thread2.start();
                thread2.join();

                // Фиксируем время окончания выполнения второго раза
                endTime = System.nanoTime();

                // Выводим результаты второго запуска
                long timeElapsedThread2 = endTime - startTime;
                System.out.println("Время выполнения второго потока (второй раз): " + timeElapsedThread2 + " наносекунд");

                // Сравниваем время выполнения двух потоков
                if (timeElapsedThread1 < timeElapsedThread2) {
                    System.out.println("Первый поток выполняется быстрее.");
                } else if (timeElapsedThread1 > timeElapsedThread2) {
                    System.out.println("Второй поток выполняется быстрее.");
                } else {
                    System.out.println("Оба потока выполняются за одинаковое время.");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        private static long fibonacci(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        private static long factorial(int n) throws IllegalAccessException {
            if (n < 0) {
                throw new IllegalAccessException("Factorial is only defined for non-negative numbers ");
            }
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }

