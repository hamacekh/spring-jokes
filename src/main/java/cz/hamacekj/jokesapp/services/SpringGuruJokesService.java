package cz.hamacekj.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringGuruJokesService implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public SpringGuruJokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String generateRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
