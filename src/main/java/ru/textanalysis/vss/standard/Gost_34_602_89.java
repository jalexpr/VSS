package ru.textanalysis.vss.standard;

import ru.textanalysis.vss.data.Heading;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class Gost_34_602_89 extends Standard {
    public Gost_34_602_89() {
        super(
                "Gost_34_602_89", new Heading<>(1, Arrays.asList("ТРЕМИНЫ", "СОКРАЩЕНИЯ", "НАИМЕНОВАНИЯ")),
                new Heading<>(1, Arrays.asList("ОБЩИЕ СВЕДЕНИЯ")),
                new Heading<>(1, Arrays.asList("НАЗНАЧЕНИЕ", "ЦЕЛИ")),
                new Heading<>(1, Arrays.asList("ХАРАКТЕРИСТИКА ОБЪЕКТА АВТОМАТИЗАЦИИ")),
                new Heading<>(1, Arrays.asList("ТРЕБОВАНИЯ К СИСТЕМЕ"),
                        new Heading<>(2, Arrays.asList("ТРЕБОВАНИЯ К СИСТЕМЕ В ЦЕЛОМ"),
                                new Heading<>(3, Arrays.asList("СТРУКТУРЕ СИСТЕМЫ", "ФУНКЦИОНИРОВАНИЮ СИСТЕМЫ")),
                                new Heading<>(3, Arrays.asList("ПОКАЗАТЕЛИ НАЗНАЧЕНИЯ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ К НАДЕЖНОСТИ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ К БЕЗОПАСНОСТИ")),
                                new Heading<>(3, Arrays.asList("ЭРГОНОМИКЕ", "ЭСТЕТИКЕ")),
                                new Heading<>(3, Arrays.asList("ЭРГОНОМИКЕ", "ЭСТЕТИКЕ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ К ЗАЩИТЕ ИНФОРМААЦИИ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ ПО СТХРАННОСТИ ИНФОРМАЦИИ ПРИ АВАРИЯХ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ К ЗАЩИТЕ ОТ ВЛИЯНИЯ ВНЕШНИХ ВОЗДЕЙСТВИЙ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ ПАТЕНТНОЙ ЧИСТОТЕ")),
                                new Heading<>(3, Arrays.asList("СТАНДАРТИЗАЦИИ", "УНИФИКАЦИИ")),
                                new Heading<>(3, Arrays.asList("ЭКСПЛУАТАЦИИ", "ОБСЛУЖИВАНИЮ", "РЕМОНТУ", "ХРАНЕНИЮ")),
                                new Heading<>(3, Arrays.asList("К ЧИСЛЕННОСТИ", "КВАЛИФИКАЦИИ", "РЕЖИМУ")),
                                new Heading<>(3, Arrays.asList("ТРЕБОВАНИЯ К ТРАСПОРТАБЕЛЬНОСТИ")),
                                new Heading<>(3, Arrays.asList("ДОПОЛНИТЕЛЬНЫЕ ТРЕБОВАНИЯ"))
                        )
                ),
                new Heading<>(1, Arrays.asList("СОСТАВ И СОДЕРЖАНИЕ РАБОТ")),
                new Heading<>(1, Arrays.asList("КОНТРОЛЯ", "ПРИЕМКИ", "ПРИЕМКЕ")),
                new Heading<>(1, Arrays.asList("К СОСТАВУ", "СОДЕРЖАНИЮ РАБОТ")),
                new Heading<>(1, Arrays.asList("ТРЕБОВАНИЯ К ДОКУМЕНТИРОВАНИЮ")),
                new Heading<>(1, Arrays.asList("ИСТОЧНИКИ РАЗРАБОТКИ")),
                new Heading<>(1, Arrays.asList("ПРИЛОЖЕНИЕ"))
        );
    }
}
