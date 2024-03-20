package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeGenerator implements JokeGenerator {

    final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeGenerator(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomOne() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
