
---


# Testing Strategy
## Testing Pyramid
- Most tests are unit tests (8), fewer integration tests (2), reflecting the pyramid.

## Black-box vs White-box
- Unit tests: white-box (we know the internal logic)
- Integration tests: black-box (simulating user interactions)

## Functional vs Non-functional
- Tested core operations (functional)
- Did not test UI performance (non-functional)

## Regression Testing
- Unit and integration tests allow catching regressions in future updates

## Test Results Table

| Test Name | Type | Status |
|-----------|------|-------|
| testAddition | Unit | Pass |
| testSubtraction | Unit | Pass |
| testMultiplication | Unit | Pass |
| testDivision | Unit | Pass |
| testDivisionByZero | Unit | Pass |
| testNegativeNumbers | Unit | Pass |
| testDecimalNumbers | Unit | Pass |
| testLargeNumbers | Unit | Pass |
| testFullCalculationFlow | Integration | Pass |
| testClearFunction | Integration | Pass |