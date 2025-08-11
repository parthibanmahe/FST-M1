import pytest

@pytest.mark.activity
@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18)])
def test_balance(wallet, earned, spent, expected):
    # Add earned to wallet
    wallet += earned

    # Substract the spent amount from wallet
    wallet -= spent 

    # Check the reamining balance
    assert wallet == expected
