## MealRecipies


A simple application that let you search for some interesting meal recipes. 
If you want you can also save your favorites.



Used technologies:
- Kotlin,
- Room database,
- Retrofit (connection with mealDB API),
- RxJava3,
- MVVM architecture
- some very elementary usage of Kotlin Coroutines (together with Room calls),
- Glide


## TODO:
The mini-project needs some improvement:
- dependency injection
- the layout for now is soo underdeveloped (but this miniproject is not about practicing UI design)
- unlucky, for now in MealRepository class anti-pattern occured- mealLists are kept in MutableLiveData.
Accordingly to proandroiddev.com I should have used Kotlin Coroutines, suspend functions there.
