package org.example.Java_072;
/**
 * Pytanie: Jakie są różnice między dwiema strukturami danych: Vector i ArrayList?
 * Odpowiedź:
 * Główne różnice między Vector a ArrayList w Javie dotyczą synchronizacji i wydajności.
 * Vector jest zsynchronizowany, co oznacza, że jest bezpieczny w użyciu w aplikacjach
 * wielowątkowych, ale może to wpływać na wydajność. ArrayList nie jest zsynchronizowana,
 * co czyni ją szybszą w operacjach, ale nie jest bezpieczna w kontekście wielowątkowym
 * bez zewnętrznej synchronizacji. Kolejna różnica to sposób zarządzania pojemnością:
 * Vector domyślnie zwiększa swoją pojemność o 100% gdy potrzebuje więcej miejsca,
 * podczas gdy ArrayList zwiększa swoją pojemność o 50%.
 */

class Cookbook {
    // Przykład użycia ArrayList
    private java.util.ArrayList<String> recipes = new java.util.ArrayList<>();

    // Przykład użycia Vector
    private java.util.Vector<String> ingredients = new java.util.Vector<>();

    // Dodanie przepisu do książki kucharskiej
    public void addRecipe(String recipe) {
        recipes.add(recipe); // Użycie ArrayList
    }

    // Dodanie składnika do listy składników
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); // Użycie Vector
    }

    public static void main(String[] args) {
        Cookbook myCookbook = new Cookbook();

        // Dodawanie przepisów i składników
        myCookbook.addRecipe("Ciasto czekoladowe");
        myCookbook.addIngredient("Czekolada");

        // Wyświetlenie przepisów i składników
        System.out.println("Przepisy: " + myCookbook.recipes);
        System.out.println("Składniki: " + myCookbook.ingredients);
    }
}

/**
 * W tym kodzie definiujemy klasę Cookbook, która używa ArrayList do przechowywania
 * przepisów i Vector do przechowywania listy składników. Demonstruje to praktyczne
 * zastosowanie obu struktur danych. ArrayList jest używana do przechowywania przepisów
 * ze względu na jej szybkość operacji w jednowątkowym środowisku, podczas gdy Vector
 * jest używany do składników, co może być przydatne w środowiskach wielowątkowych,
 * choć w tym konkretnym przykładzie wybór między nimi jest głównie dydaktyczny.
 */

