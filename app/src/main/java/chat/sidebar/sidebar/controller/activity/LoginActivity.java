package chat.sidebar.sidebar.controller.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;

/**
 * Created by joeacanfora on 9/2/17.
 */

public class LoginActivity extends BaseActivity  {

    protected EditText phoneEditText;

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks phoneCallBacks;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        phoneCallBacks = phoneCallBackBuilder();


    }

    protected void enterPhoneNumberClicked() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phoneEditText.getText().toString().trim(),        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                phoneCallBacks);        // OnVerificationStateChangedCallbacks
    }


    /**
     * Callbacks for the phone verification system
     * @return
     */
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks phoneCallBackBuilder() {
        return new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                //TODO
            }

            @Override
            public void onVerificationFailed(FirebaseException e) {
                //TODO
            }
        };
    }
}
