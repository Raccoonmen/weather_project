# 날씨정보를 받아오는 API

## 요구사항

### POST / create / diary
- [X] date parameter 로 받아주세요. (date 형식 : yyyy-MM-dd)
- [X] text parameter 로 일기 글을 받습니다.
- [X] 외부 API 에서 받아온 날씨 데이터와 함께 DB에 저장합니다.

### GET / read / diary
- [X] date parameter 로 조회할 날짜를 받습니다.
- [X] 해당 날짜의 일기를 List 형태로 반환합니다.

### GET / read / diaries
- [X] startDate, ednDate parameter 로 조회할 날짜 기간의 시작일/종료일을 받습니다.
- [X] 해당 기간의 일기를 List 형태로 반환합니다.

### PUT / update / diary
- [X] date parameter 로 수정할 날짜를 받습니다.
- [X] text parameter 로 수정할 새 일기 글을 받습니다.
- [X] 해당 날짜의 첫번째 일기 글을 새로 받아온 일기글로 수정합니다.

### DELETE / delete / diary
- [X] date parameter 로 삭제할 날짜를 받습니다.
- [X] 해당 날짜의 모든 일기를 지웁니다.
