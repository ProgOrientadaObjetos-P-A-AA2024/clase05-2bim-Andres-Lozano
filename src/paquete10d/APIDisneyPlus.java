/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10d;

public class APIDisneyPlus implements APIMovie {

    private String apiM;

    @Override
    public void establecerApiKey(String ak) {
        apiM = ak + 22222;
    }

    @Override
    public String obtenerApiKey() {
        return apiM;
    }

}
