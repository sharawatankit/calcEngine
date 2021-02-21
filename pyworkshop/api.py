import requests
api_url = "http://shibe.online/api/shibes?count=1"
response = requests.get(api_url)

status_code = response.status_code
response = response.json()
print(response)
print("status code:", status_code)