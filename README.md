# Wallet Composable with SDUI

This library helps you to create a great looking Fintech App with these animated cards. 
Cards can be customize with the data that you send, being able to change the color, name, brand, bank, etc. 
The following data model is thought to work with Server Driven UI. 


### Data model:
```
 {
            "type": "WALLET_CARDS",
            "data": {
                "background": "BACKGROUND",
                "cards": [
                    {
                        "card_holder": "John Doe",
                        "alias": "Bimonetaria",
                        "id": "123456789",
                        "color": "#9A7CB1",
                        "last_4": "1098",
                        "brand": "VISA",
                        "status": "active",
                        "type": "CREDIT",
                        "expiration_date": "12/2022",
                        "bank": "ABC Bank",
                        "is_default": "false"
                    },
                    {
                        "card_holder": "Sarah Williams",
                        "alias": "Crédito uno",
                        "id": "789123456",
                        "color": "#9A7CB1",
                        "last_4": "2456",
                        "brand": "MASTERCARD",
                        "status": "active",
                        "type": "CREDIT",
                        "expiration_date": "03/2023",
                        "bank": "GHI Bank",
                        "is_default": "false"
                    },
                    {
                        "card_holder": "Robert Brown",
                        "alias": "Bimonetaria",
                        "id": "321654987",
                        "color": "#15263D",
                        "last_4": "9823",
                        "brand": "VISA",
                        "status": "active",
                        "type": "DEBIT",
                        "expiration_date": "11/2022",
                        "bank": "JKL Bank",
                        "is_default": "true"
                    }
                ]
            }
        }
```

### Figma link:
 https://www.figma.com/file/IbnSDojGOdICYj5EflcqOw/Now-In-ThinkUp?type=design&node-id=4%3A84&mode=design&t=8gqXlIneytvKuE1k-1


### Video example:

https://github.com/thinkupsoft/AOS-WalletComposable/assets/49696989/e2eb489f-ab5e-4949-8bc5-df59de484150

