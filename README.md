# Dagger-2-Kotlin-MVP
This project is an guide to implement Dagger 2 (Dependency injection) from scratch

# General Steps To Inject New Presenter
1. Add inject() in AppComponent with Target class argument.
2. Add @Provides annotated method in PresenterModule for each source object to be injected.
3. Add @Inject annotation to each Source member variable in Target class.
4. Add WikiApplication.wikiComponent.inject(this) in onCreate() in Target class.
