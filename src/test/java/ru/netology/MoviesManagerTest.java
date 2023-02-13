package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void shouldFindAllMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        manager.add("Film XI");


        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X", "Film XI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast10Movies() {
        MoviesManager manager = new MoviesManager(10);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        manager.add("Film XI");

        String[] expected = {"Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast5Movies() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        manager.add("Film XI");

        String[] expected = {"Film XI", "Film X", "Film IX", "Film VIII", "Film VII"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast11Movies() {
        MoviesManager manager = new MoviesManager(11);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        manager.add("Film XI");

        String[] expected = {"Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNewMovies() {
        MoviesManager manager = new MoviesManager(10);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

