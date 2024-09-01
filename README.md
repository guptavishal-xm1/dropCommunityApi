
# Community Drop Backend Apis path

A Api layer for Backend Data </br>
<a href="https://communitydrop-communityapi.azuremicroservices.io/">https://communitydrop-communityapi.azuremicroservices.io/</a>



## API Reference

#### Get User Detail by Email

```http
  GET /users/${email}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email` | `string` | **Required**. Email as path Variable |

#### Get item

```http
  GET /getAllUsers
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `null`      | `null` | |

#### Boolean

```http
  GET /isExist
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Email`      | `string` | **Required**. Email if Exist in database |

```http
  POST /user
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Raw Data`      | `JSON` | **Required**. User Raw Data |

## Raw Data for user Response Body




```javascript
{
    "name": "Vishal Gupta",
    "email": "Test@gmail.com",
    "password": "testPassword",
    "tonWalletAddress": "Uqweiwhcbbhfdasoer7Y-ey"
}
```

