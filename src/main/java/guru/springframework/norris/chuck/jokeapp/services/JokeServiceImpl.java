package guru.springframework.norris.chuck.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();

    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
