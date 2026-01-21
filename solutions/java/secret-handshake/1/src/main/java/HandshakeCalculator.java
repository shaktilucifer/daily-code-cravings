import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binaryString = Integer.toBinaryString(number);
        String  bin = String.format("%5s", binaryString).replace(' ', '0');
        String binary = bin.substring(bin.length() - 5);
        System.out.println(binary);
        List<Signal> signals = new LinkedList<>();
        boolean reverse = false;
        if(binary.charAt(0) == '1') reverse = true;
        if(binary.charAt(4) == '1') signals.add(Signal.WINK);
        if(binary.charAt(3) == '1') signals.add(Signal.DOUBLE_BLINK);
        if(binary.charAt(2) == '1') signals.add(Signal.CLOSE_YOUR_EYES);
        if(binary.charAt(1) == '1') signals.add(Signal.JUMP);


        if(reverse) Collections.reverse(signals);
        return signals;
    }

}
