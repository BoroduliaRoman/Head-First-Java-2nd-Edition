/*import javax.sound.midi.*;

public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        // Создаём и открываем синтезатор
        try {
            Sequencer sequencer = new MidiSystem.getSequencer();
            sequencer.open();

            // Создаём последовательность и дорожку
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            // Создаём группу событий, чтобы ноты продолжали подниматься
            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(128,1,i,100,i+2));
            }
            // Запускаем его
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception exception) {exception.printStackTrace();}
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception exception) {}
        return event;
    }
}
*/