package ru.iteco.fmhandroid.ui.matches;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.ui.matches.TimeoutEspresso.onViewWithTimeout;

public class CustomViewAssertions {
    public static void checkToastMessageIsDisplayed(String message) {
        onViewWithTimeout(withText(message)).inRoot(ru.iteco.fmhandroid.ui.matchers.ToastMatcher.isToast()).checkWithTimeout(matches(isDisplayed()));
    }
}
