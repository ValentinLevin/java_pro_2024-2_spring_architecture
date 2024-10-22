# Домашнее задание по курсу Java Pro 2024

*Студент: Валентин Левин*

## 2. Архитектура Spring framework

1. Привести пример создания бина, используя все 3 варианта метаданных на примере класса Employee с полями (String name, int age, String department)
2. Создайте и зарегистрируйте своё событие с использованием ApplicationEvent после создайте обработчик для этого события и покажите, как он работает на примере.
3. Spring Expression Language (SpEL) - создать пример конфигурации, в которой вычисляются значения для бинов на основе выражений (будет 10 выражений 2 из них systemProperties, 1 из ряда получения уже созданного бина, 1 из вычислений остальные по желанию, но не из application.properties)
4. Из контекста приложения достать созданные в 1 пункте бины и вывеcти все их возможные данные в консоль (поэксперементировать с бином с видимостью Prototype)
5. Используя пример из jar файла создать 2 контроллера (по вашему выбору) и использовать EmployeeService (так же созданный класс) в 2 вариантах (Через SDI И CDI)
6. Создать бин с использованием аннотации @Lazy — тут реализуйте метод который будет возвращать рандомное число от 1 до 100
   Создайте второй бин, который будет получать первый бин (с ленивой инициализацией) и сохранять его значение в поле. Когда вы вызовете метод второго бина, он должен выводить это значение на консоль.  
   Создайте контроллер в котором будет ендпоинт путь - /getRandomNumber  
   Отправьте запрос несколько раз подряд и посмотрите результат — итоги напишите текстом — и объясните результат  

