package HomeWork6;

import lombok.Getter;

import java.util.Objects;

@Getter
public class NoteBook {
    Brend brend;
    Color color;
    GamingNoteBook gamingNoteBook;

    public NoteBook(Brend brend, Color color, GamingNoteBook gamingNoteBook) {
        this.brend = brend;
        this.color = color;
        this.gamingNoteBook = gamingNoteBook;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "brend=" + brend +
                ", color=" + color +
                ", gamingNoteBook=" + gamingNoteBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return brend == noteBook.brend && color == noteBook.color && gamingNoteBook == noteBook.gamingNoteBook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, color, gamingNoteBook);
    }
}
