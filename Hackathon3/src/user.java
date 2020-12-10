
public class userstub {
	public static int user() { //basic stub of 1 user with data = 0
		return 0;
	}
	public int user(int i) { //variable stub of 1 user with data = i
		return i;
	}
		public static void user(int signpos, int signneg, int signzero) { //variable list of users with data = pos, neg, zero
			while (signpos > 0) {
				userstub.user(2);
				signpos = signpos - 1;
			}
			while (signneg > 0) {
				userstub.user(-3);
				signneg = signneg - 1;
			}
			while (signzero > 0) {
				userstub.user(0);
				signzero = signzero - 1;
			}
		return;
	}
}