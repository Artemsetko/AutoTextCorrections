package corrector;

/**
 * Created by АРТЁМ on 23.12.2015.
 */
public class Corrected {

        private final long id;
        private final String content;

        public Corrected(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

        public String getCorrectedContent() {
        return new Corrector().correctString(content);
    }
    }

