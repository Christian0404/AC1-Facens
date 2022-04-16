package ac1_pokemon_top;

public class AC1_Pokemon_TOP {
      public static void main(String[] args) {
        Pokemon meuPokemon = new Pokemon("Charizard", "Fogo", 11);
        Pokemon outroPokemon = new Pokemon("Blastoise", "Agua", 10);
        
        Batalhas batalha1 = new Batalhas();
               
        System.out.println("Seu Pokémon: ");
        meuPokemon.imprimiPokemon();
        System.out.println("Pokémon Inimigo: ");
        outroPokemon.imprimiPokemon();
        
        batalha1.meuPokemon(meuPokemon.getNome(),meuPokemon.getAtaque());
        batalha1.outroPokemon(outroPokemon.getNome(),outroPokemon.getDefesa());
        
        batalha1.startBattle();               
  }
}