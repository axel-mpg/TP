package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith( MockitoExtension.class)

public class LottoTest {

    @Test
    public void testDraw() {
        Lotto mockedLotto = mock(Lotto.class);
        int[] tabTest = {0,0,0,0,0,0};
        when(mockedLotto.draw()).thenReturn(tabTest);
        Assertions.assertEquals(tabTest, mockedLotto.draw());
    }

    @Test
    public void testPlay() {
        Player mockedPlayer = mock(Player.class);
        boolean result = true;
        when(mockedPlayer.play()).thenReturn(result);
        Assertions.assertEquals(true, mockedPlayer.play());
    }
}
