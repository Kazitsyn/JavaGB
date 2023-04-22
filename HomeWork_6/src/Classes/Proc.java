package Classes;

/**
 * Класс процессоров
 */
public class Proc {

    private final String model;
    private final String type;
    private final Double volume;

    /**
     * Конструктор
     * @param model Производитель
     * @param type Модель
     * @param volume Частота ЦПУ
     */
    public Proc(String model, String type, Double volume) {
        this.model = model;
        this.type = type;
        this.volume = volume;
    }

    /**
     * Получить название производителя
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Получить модель процессора
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Получить частоту ЦПУ
     * @return
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Перевести в текстовый формат (Производитель, модель процессора, частота ЦПУ)
     * @return
     */
    @Override
    public String toString() {
        return "Proc{" +
                model +
                ", " + type +
                ", " + volume +
                "GHz}";
    }
}
