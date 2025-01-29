

---

## MVVM Android App Example

This is a simple Android app that demonstrates the **Model-View-ViewModel (MVVM)** architecture using **Jetpack Compose** and **LiveData**.

### Project Structure

1. **MainActivity**: 
   - The main entry point of the app.
   - Sets up the **ViewModel** (`HomeViewModel`) and initializes the UI using **Jetpack Compose**.
   - Utilizes `enableEdgeToEdge()` for edge-to-edge layout on compatible devices.

2. **Model**:
   - **UserRepository**: A class that simulates fetching user data from a remote source or database (with a 3-second delay).
   - **UserData**: A simple data class to hold user information (name and age).

3. **ViewModel**:
   - **HomeViewModel**: A `ViewModel` that holds and manages user data. It fetches data using the `UserRepository` and exposes the data as `LiveData` to the view.

4. **View**:
   - **Homepage**: A Composable function that displays a button to trigger data fetching and shows the fetched user data (name and age). It observes `LiveData` from the `HomeViewModel` to update the UI.

### How it Works

- The app starts by displaying a button labeled "GET DATA".
- When the button is clicked, the `HomeViewModel` makes a call to `UserRepository` to fetch user data (simulated with a 3-second delay).
- Once the data is fetched, it is observed in the UI and displayed (name and age).

### Libraries & Technologies

- **Jetpack Compose**: For building the UI declaratively.
- **LiveData**: To observe and manage data in a lifecycle-aware way.
- **ViewModel**: To separate UI-related data from the Activity/Fragment lifecycle.
- **Kotlin Coroutines**: For asynchronous operations.



---

