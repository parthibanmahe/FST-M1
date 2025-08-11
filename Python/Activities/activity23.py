import pytest

@pytest.mark.activity
def test_sum(num_list):
    # Create a sum variable
    sum = 0

    # Calculate the sum of numbers in the list
    for num in num_list:
        sum += num

    # Assertion
    assert sum == 55
