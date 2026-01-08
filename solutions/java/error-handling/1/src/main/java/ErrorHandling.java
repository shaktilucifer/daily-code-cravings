import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws Exception {
          throw new Exception();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception {
          throw new Exception("This is the detail message.");
    }

    void handleErrorByThrowingAnyUncheckedException() {
        int a = 1/ 0;
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
                    throw new RuntimeException("This is the detail message.");
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException("This is the detail message.");
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException("This is the detail message.");        
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            Integer i = Integer.parseInt(integer);
        } catch(Exception e) {
            return Optional.empty();
        }
        return Optional.of(Integer.parseInt(integer));
    }

}
