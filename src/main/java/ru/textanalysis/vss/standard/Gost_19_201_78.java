package ru.textanalysis.vss.standard;

import ru.textanalysis.vss.data.Heading;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class Gost_19_201_78 extends Standard {
    public Gost_19_201_78() {
        super(
                "Gost_19_201_78", new Heading<>(1, Arrays.asList("ТРЕМИНЫ", "СОКРАЩЕНИЯ", "НАИМЕНОВАНИЯ")),
                new Heading<>(1, Arrays.asList("ВВЕДЕНИЕ")),
                new Heading<>(1, Arrays.asList("ОСНОВАНИЯ ДЛЯ РАЗРАБОТКИ")),
                new Heading<>(1, Arrays.asList("НАЗНАЧЕНИЕ РАЗРАБОТКИ")),
                new Heading<>(1, Arrays.asList("ТРЕБОВАНИЯ"),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К ФУНКЦИОНАЛЬНЫМ ХАРАКТЕРИСТИКАМ")),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К НАДЕЖНОСТИ")),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К ЭКСПЛУАТАЦИИ")),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К СОСТАВУ И ПАРАМЕТРАМ ТЕХНИЧЕСКИХ СРЕДСТВ")),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К ИНФОРМАЦИОННОЙ И ПРОГРАММНОЙ СОВМЕСТИМОСТИ")),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К МАРКИРОВКЕ И УПАКОВКЕ")),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К ТРАСПОРТИРОВАНИЮ И ХАРНЕНИЮ")),
                        new Heading<>(2, Arrays.asList("СПЕЦИАЛЬНЫЕ ТРЕБОВАНИЯ"))),
                new Heading<>(1, Arrays.asList("ТРЕБОВАНИЯ К ПРОГРАММНОЙ ДОКУМЕНТАЦИИ")),
                new Heading<>(1, Arrays.asList("ТЕХНИКО-ЭКОНОМИЧЕСКИЕ ПОКАЗАТЕЛИ")),
                new Heading<>(1, Arrays.asList("СТАДИИ И ЭТАПЫ РАЗРАБОТКИ")),
                new Heading<>(1, Arrays.asList("ПОРЯДОК КОНТРОЛЯ И ПРИЕМКИ"))
        );
    }
}
