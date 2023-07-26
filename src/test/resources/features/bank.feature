Feature: Bank Functionalities
    
    Scenario: client makes call to GET /banks/ABHY0065001
    When the client calls /banks/ with "ABHY0065001"
    Then the bank branch api receives status code of 200
    And expects a JSON equivaluent to "{\"ifsc\":\"ABHY0065001\",\"bank_id\":60,\"branch\":\"RTGS-HO\",\"address\":\"ABHYUDAYA BANK BLDG., B.NO.71, NEHRU NAGAR, KURLA (E), MUMBAI-400024\",\"district\":\"GREATER MUMBAI\",\"city\":\"MUMBAI\",\"state\":\"MAHARASHTRA\",\"bankName\":\"ABHYUDAYA COOPERATIVE BANK LIMITED\"}"
    
    

    