package Test03;

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}

// polymorphism/music/Wind.java
// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
    // Redefine interface method:
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}


