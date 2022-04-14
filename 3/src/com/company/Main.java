package com.company;

public class Main {
    static Dwarfs dwarfs = new Dwarfs(Persons.Pilulkin,
            Place.Aside,
            Condition.Unexpected,
            Stuff.Shots);

    static Police police = new Police(
            Place.Hill,
            Condition.TheSameTime,
            Stuff.Guns);

    public static void main(String[] args) {

        System.out.println(dwarfs.getPerson().getTitle() + " " + dwarfs.say());
        System.out.println(dwarfs.getCondition().getTitle() +
                " " + dwarfs.getPlace().getTitle() +
                " " + dwarfs.heard() +
                " " + dwarfs.getStuff().getTitle());

        changeDwarfsScene(Persons.Korotishki,
                Place.Back,
                Condition.Running,
                dwarfs.getStuff());

        System.out.println(dwarfs.getPerson().getTitle() +
                " " + dwarfs.around() +
                ", " + dwarfs.saw2() +
                " " + Persons.Kolosok.getTitle() +
                ", он " + dwarfs.getCondition().getTitle() +
                " " + dwarfs.comeBack() +
                " " + dwarfs.getPlace().getTitle());

        System.out.println(police.getCondition().getTitle() +
                " " + police.getPlace().getTitle() +
                " " + police.out() +
                " " + police.getPerson().getTitle());

        changePoliceScene(Place.Down,
                Condition.Quickly,
                Stuff.Guns);

        System.out.println(police.getCondition().getTitle() +
                " " + police.down() +
                ", " + police.stopped() +
                ", " + police.applied() +
                " " + police.getStuff().getTitle() +
                ", " + police.ready());

        changeDwarfsScene(Persons.Znayka,
                dwarfs.getPlace(),
                Condition.Hesitate,
                Stuff.Device);

        System.out.println(dwarfs.getPerson().getTitle() +
                " " + dwarfs.saw1() +
                " это, " + dwarfs.getCondition().getTitle() +
                " " + dwarfs.enabled() +
                " " + dwarfs.getStuff().getTitle());
        System.out.println(dwarfs.rangOut());

        changePoliceScene(Place.Back,
                Condition.NotSuspected,
                Stuff.ZeroGravity);

        System.out.println(police.getCondition().getTitle() +
                ", что " + police.couldBe() +
                " " + police.getStuff().getTitle() +
                ", " + police.getPerson().getTitle() +
                " " + police.shot());

        changePoliceScene(police.getPlace(),
                Condition.Speed,
                Stuff.Power);

        System.out.println(police.getStuff().getTitle() +
                " понесла их " + police.getPlace().getTitle() +
                " " + police.getCondition().getTitle());

        changePoliceScene(Place.InAir,
                Condition.TheSameTime,
                Stuff.Dot);

        System.out.println(police.getPerson().getTitle() +
                " " + police.rushed() +
                " " + police.getPlace().getTitle() +
                " и " + police.turnedInto() +
                " " + police.getStuff().getTitle());
    }

    //    Пилюлькин сказал: Неожиданно в стороне послышались выстрелы.
    //    Коротышки обернулись и увидели Колоска, который бегом возвращался назад.
    //    В тот же миг из-за холма выскочили пятеро полицейских. Быстро спустившись вниз,
    //    они остановились, как по команде, и приложились к ружьям, готовясь выстрелить.
    //    Знайка увидел это и, ни секунды не медля, включил прибор невесомости.
    //    Раздался залп. Не подозревая, что могут оказаться в состоянии невесомости,
    //    полицейские выстрелили, и возникшая реактивная сила понесла их назад.
    //    В результате они [полицейские] помчались по воздуху с такой страшной скоростью,
    //    что в одну секунду превратились в едва заметные точки и скрылись за горизонтом

    private static void changeDwarfsScene(Persons person,
                                    Place place,
                                    Condition condition,
                                    Stuff stuff) {
        dwarfs.setPerson(person);
        dwarfs.setCondition(condition);
        dwarfs.setPlace(place);
        dwarfs.setStuff(stuff);
    }

    private static void changePoliceScene(Place place,
                                          Condition condition,
                                          Stuff stuff) {
        police.setCondition(condition);
        police.setPlace(place);
        police.setStuff(stuff);
    }
}
