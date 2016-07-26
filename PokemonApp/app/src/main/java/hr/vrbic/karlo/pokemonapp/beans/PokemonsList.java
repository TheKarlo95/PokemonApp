package hr.vrbic.karlo.pokemonapp.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by TheKarlo95 on 24.7.2016..
 */
public class PokemonsList {

    private static List<Pokemon> pokemonList = new ArrayList<>();

    public static List<Pokemon> getAll() {
        pokemonList = new ArrayList<>(new HashSet<>(pokemonList));
        Collections.sort(pokemonList);
        return Collections.unmodifiableList(pokemonList);
    }

    public static void add(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    public static void addAll(Collection<Pokemon> pokemons) {
        pokemonList.addAll(pokemons);
    }
}
