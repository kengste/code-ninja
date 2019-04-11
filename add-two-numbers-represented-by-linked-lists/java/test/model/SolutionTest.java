package model;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SolutionTest {

    private ListNode l1;
    private ListNode l2;
    private ListNode expected;

    public SolutionTest(ListNode l1, ListNode l2, ListNode expected) {
        this.l1 = l1;
        this.l2 = l2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);
        return Arrays.asList(new Object[][]{
                {l1, l2, expected}
        });
    }

    @Test
    public void test_addTwoNumbers() {
        // Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        // Output: 7 -> 0 -> 8
        ListNode test = new Solution().addTwoNumbers(l1,l2);

        Assert.assertThat(test.val, CoreMatchers.is(expected.val));
        Assert.assertThat(test.next.val, CoreMatchers.is(expected.next.val));
        Assert.assertThat(test.next.next.val, CoreMatchers.is(expected.next.next.val));
    }
}
