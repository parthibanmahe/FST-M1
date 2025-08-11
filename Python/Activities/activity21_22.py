import pytest

@pytest.mark.activity
def test_add():
    # Input numbers
    num1 = 10
    num2 = 20
    #Accertion
    assert num1 + num2 == 30

@pytest.mark.activity
def test_subtract():
    # Input numbers
    num1 = 50
    num2 = 20

    assert num1 - num2 == 30    

@pytest.mark.activity 
def test_multiply():
    # Input numbers
    num1 = 10
    num2 = 3

    assert num1 * num2 == 30    

@pytest.mark.activity
def test_divide():
    # Input numbers
    num1 = 90
    num2 = 3

    assert num1 / num2 == 30    
