package Classes;

/**
 * Класс ноутбук
 */
public class Noutbuk {
    private final String model;
    private final String color;
    private DDR ddr;
    private ROM rom;
    private VideoCard videoCard;
    private final Double weight;
    private final Double diagonal;
    private Proc proc;

    /**
     * Конструктор
     * @param model Производитель
     * @param color Цвет
     * @param weight Вес
     * @param diagonal Диагональ
     */
    public Noutbuk(String model, String color, Double weight, Double diagonal) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.diagonal = diagonal;
    }

    /**
     * Добавить ОЗУ
     * @param ddr
     */
    public void setDdr(DDR ddr) {
        this.ddr = ddr;
    }

    /**
     * Добавить ОЗУ с параметрами
     * @param model Производитель
     * @param volume Значение памяти
     * @param type Поколение ОЗУ
     */
    public void setDdr(String model, Double volume, String type) {
        this.ddr = new DDR(model, volume, type);
    }

    /**
     * Добавить ПЗУ
     * @param rom
     */
    public void setRom(ROM rom) {
        this.rom = rom;
    }

    /**
     * Добавить ПЗУ с параметрами
     * @param model Производитель
     * @param volume Объем памчти
     * @param type Тип памяти
     */
    public void setRom(String model, Double volume, String type) {
        this.rom = new ROM(model, volume, type);
    }

    /**
     * Добавить видеокарту
     * @param videoCard
     */
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    /**
     * Добавить видеокарту с параметрами
     * @param model производитель
     * @param volume видеопамять
     * @param type модель
     */
    public void setVideoCard(String model, Double volume, String type) {
        this.videoCard = new VideoCard(model, volume, type);
    }

    /**
     * Получить название производителя ноутбука
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Получить цвет ноутбука
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Получить ОЗУ
     * @return
     */
    public DDR getDdr() {
        return ddr;
    }

    /**
     * Получить ПЗУ
     * @return
     */
    public ROM getRom() {
        return rom;
    }

    /**
     * Получить видеокарту
     * @return
     */
    public VideoCard getVideoCard() {
        return videoCard;
    }

    /**
     * Получить вес
     * @return
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Получить диагональ
     * @return
     */
    public Double getDiagonal() {
        return diagonal;
    }

    /**
     * Добавить процессор
     * @param proc
     */
    public void setProc(Proc proc) {
        this.proc = proc;
    }

    /**
     * Добавить процессор с параметрами
     * @param model производитель
     * @param volume частота ЦПУ
     * @param type поколение
     */
    public void setProc(String model, Double volume, String type) {
        this.proc = new Proc(model, type, volume);
    }

    /**
     * Получить процессор
     * @return
     */
    public Proc getProc() {
        return proc;
    }

    /**
     * Перевести в текст (Производитель ноутбука, цвет, диагональ, процессор, ОЗУ, ПЗУ, видеокарта, вес)
     * @return
     */
    @Override
    public String toString() {
        return "Noutbuk{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", diagonal=" + diagonal +
                ", proc=" + proc +
                ", " + ddr +
                ", " + rom +
                ", " + videoCard +
                ", weight=" + weight +
                '}';
    }
}
