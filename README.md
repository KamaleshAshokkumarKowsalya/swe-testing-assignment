# Quick-Calc

Quick-Calc is a simple Java calculator application that supports **addition**, **subtraction**, **multiplication**, **division (with zero handling)**, and a **clear** operation.  
This project is intended to demonstrate clean coding practices, **unit + integration testing**, and good version control habits.

---

## Features
- Addition, subtraction, multiplication, division
- Division-by-zero handling
- Clear/reset functionality
- Maven-based build and test execution

---

## Tech Stack / Requirements
- **Java**: 17+ (project currently compiles with Maven compiler level set to **21** in `pom.xml`)
- **Maven**
- **JUnit** (unit/integration tests)

---

## Setup Instructions
1. Install Java (17+) and Maven
2. Clone this repository
3. Navigate into the project folder

---

## Build & Run

### Compile
```bash
mvn clean compile
```

### Run the application
```bash
mvn compile exec:java -Dexec.mainClass="calculator.QuickCalcApp"
```

> Note: Ensure the `exec-maven-plugin` is available/configured in your Maven setup if required.

---

## Running Tests
Run all tests with:
```bash
mvn test
```

---

## Testing Strategy

### Testing Pyramid
- Mostly **unit tests (8)**
- Fewer **integration tests (2)**  
  This matches the recommended testing pyramid approach.

### Black-box vs White-box
- **Unit tests**: white-box (tests written with knowledge of internal logic)
- **Integration tests**: black-box (simulate user interaction / full flow)

### Functional vs Non-functional
- Covered core calculator operations (**functional testing**)
- Did not focus on UI performance or load testing (**non-functional**)

### Regression Testing
The unit and integration test suite helps catch regressions as the calculator evolves.

---

## Test Results

| Test Name | Type | Status |
|-----------|------|--------|
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

---

## Project Structure (Typical)
```text
src/
  main/java/...
  test/java/...
pom.xml
README.md
Testing.md
```

---

## License
Add a license if you plan to distribute or reuse this project publicly.