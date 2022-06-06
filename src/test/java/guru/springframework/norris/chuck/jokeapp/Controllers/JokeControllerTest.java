package guru.springframework.norris.chuck.jokeapp.Controllers;

import guru.springframework.norris.chuck.jokeapp.services.JokeService;
import guru.springframework.norris.chuck.jokeapp.services.JokeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokeControllerTest {

    private JokeController jokeController;

    @BeforeEach
    void setUp() {
        jokeController =new JokeController(new JokeServiceImpl());
    }

    @Test
    void getJokes() {
        System.out.println(jokeController.getJokes());
    }
}