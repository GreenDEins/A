package Method;

public class NewBigContainer extends NewContainer {
    public NewBigContainer() {
        super(2.59, 2.43, 12.01);
    }

    public double getShippingCost(double weight) {
        return 1800.0;
    }

    public double getWeightCapacity() {
        return Double.MAX_VALUE;
    }

    public double getVolumeCapacity() {
        return 75.587337;
    }
}

//В данном коде определен класс NewBigContainer, который является подклассом класса NewContainer. NewBigContainer представляет большой контейнер и расширяет функциональность базового класса.
//
//        В конструкторе класса NewBigContainer вызывается конструктор суперкласса NewContainer с передачей аргументов 2.59, 2.43, 12.01. Это устанавливает размеры (ширину, длину, высоту) контейнера.
//
//        Класс NewBigContainer переопределяет методы getShippingCost, getWeightCapacity и getVolumeCapacity из суперкласса NewContainer.
//
//        Метод getShippingCost возвращает статическую стоимость доставки контейнера, равную 1800.0. Это означает, что независимо от веса груза, доставка большого контейнера будет стоить 1800.0.
//        Метод getWeightCapacity возвращает максимальную грузоподъемность контейнера, которая в данном случае равна Double.MAX_VALUE (максимальное значение типа double). Это означает, что контейнер может вместить груз любого веса.
//        Метод getVolumeCapacity возвращает максимальную вместимость контейнера по объему. В данном случае значение равно 75.587337.
//        Таким образом, класс NewBigContainer предоставляет конкретные реализации методов для большого контейнера, определяя его размеры, стоимость доставки, грузоподъемность и вместимость по объему.
